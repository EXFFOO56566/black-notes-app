.class final Lcom/google/android/gms/internal/ads/fm1;
.super Lcom/google/android/gms/internal/ads/ul1;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/internal/ads/ul1<",
        "TE;>;"
    }
.end annotation


# static fields
.field static final f:Lcom/google/android/gms/internal/ads/ul1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/ul1<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final transient d:[Ljava/lang/Object;

.field private final transient e:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/fm1;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/internal/ads/fm1;-><init>([Ljava/lang/Object;I)V

    sput-object v0, Lcom/google/android/gms/internal/ads/fm1;->f:Lcom/google/android/gms/internal/ads/ul1;

    return-void
.end method

.method constructor <init>([Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ul1;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/fm1;->d:[Ljava/lang/Object;

    iput p2, p0, Lcom/google/android/gms/internal/ads/fm1;->e:I

    return-void
.end method


# virtual methods
.method final a([Ljava/lang/Object;I)I
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fm1;->d:[Ljava/lang/Object;

    iget v1, p0, Lcom/google/android/gms/internal/ads/fm1;->e:I

    const/4 v2, 0x0

    invoke-static {v0, v2, p1, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lcom/google/android/gms/internal/ads/fm1;->e:I

    add-int/2addr p2, p1

    return p2
.end method

.method final b()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fm1;->d:[Ljava/lang/Object;

    return-object v0
.end method

.method final d()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method final e()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/fm1;->e:I

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    iget v0, p0, Lcom/google/android/gms/internal/ads/fm1;->e:I

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/jl1;->a(II)I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fm1;->d:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method

.method final i()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/fm1;->e:I

    return v0
.end method

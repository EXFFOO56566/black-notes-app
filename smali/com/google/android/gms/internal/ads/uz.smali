.class public final Lcom/google/android/gms/internal/ads/uz;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Landroid/view/View;

.field private final b:Lcom/google/android/gms/internal/ads/ws;

.field private final c:Lcom/google/android/gms/internal/ads/hd1;

.field private final d:I

.field private final e:Z

.field private final f:Z


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/google/android/gms/internal/ads/ws;Lcom/google/android/gms/internal/ads/hd1;IZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/uz;->a:Landroid/view/View;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/uz;->b:Lcom/google/android/gms/internal/ads/ws;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/uz;->c:Lcom/google/android/gms/internal/ads/hd1;

    iput p4, p0, Lcom/google/android/gms/internal/ads/uz;->d:I

    iput-boolean p5, p0, Lcom/google/android/gms/internal/ads/uz;->e:Z

    iput-boolean p6, p0, Lcom/google/android/gms/internal/ads/uz;->f:Z

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/ws;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uz;->b:Lcom/google/android/gms/internal/ads/ws;

    return-object v0
.end method

.method public final b()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uz;->a:Landroid/view/View;

    return-object v0
.end method

.method public final c()Lcom/google/android/gms/internal/ads/hd1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uz;->c:Lcom/google/android/gms/internal/ads/hd1;

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/uz;->d:I

    return v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/uz;->e:Z

    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/uz;->f:Z

    return v0
.end method

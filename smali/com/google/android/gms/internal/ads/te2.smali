.class public final Lcom/google/android/gms/internal/ads/te2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:[B

.field private final b:I


# direct methods
.method public constructor <init>([BI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/te2;->a:[B

    const/4 p1, 0x0

    iput p1, p0, Lcom/google/android/gms/internal/ads/te2;->b:I

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/te2;->b:I

    add-int/2addr v0, p1

    return v0
.end method

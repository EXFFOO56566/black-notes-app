.class public final Lcom/google/android/gms/internal/ads/ki;
.super Lcom/google/android/gms/internal/ads/vh;
.source ""


# instance fields
.field private final b:Ljava/lang/String;

.field private final c:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/uh;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/uh;->b:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    if-eqz p1, :cond_1

    iget p1, p1, Lcom/google/android/gms/internal/ads/uh;->c:I

    goto :goto_1

    :cond_1
    const/4 p1, 0x1

    :goto_1
    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/internal/ads/ki;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/vh;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ki;->b:Ljava/lang/String;

    iput p2, p0, Lcom/google/android/gms/internal/ads/ki;->c:I

    return-void
.end method


# virtual methods
.method public final I()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/ki;->c:I

    return v0
.end method

.method public final m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ki;->b:Ljava/lang/String;

    return-object v0
.end method

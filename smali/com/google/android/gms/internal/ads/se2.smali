.class public abstract Lcom/google/android/gms/internal/ads/se2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private a:Lcom/google/android/gms/internal/ads/re2;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a([Lcom/google/android/gms/internal/ads/m82;Lcom/google/android/gms/internal/ads/ee2;)Lcom/google/android/gms/internal/ads/ue2;
.end method

.method protected final a()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/se2;->a:Lcom/google/android/gms/internal/ads/re2;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/re2;->a()V

    :cond_0
    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/re2;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/se2;->a:Lcom/google/android/gms/internal/ads/re2;

    return-void
.end method

.method public abstract a(Ljava/lang/Object;)V
.end method

.class public final Lcom/google/android/gms/ads/q;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Z

.field private final b:Z

.field private final c:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/er2;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-boolean v0, p1, Lcom/google/android/gms/internal/ads/er2;->b:Z

    iput-boolean v0, p0, Lcom/google/android/gms/ads/q;->a:Z

    iget-boolean v0, p1, Lcom/google/android/gms/internal/ads/er2;->c:Z

    iput-boolean v0, p0, Lcom/google/android/gms/ads/q;->b:Z

    iget-boolean p1, p1, Lcom/google/android/gms/internal/ads/er2;->d:Z

    iput-boolean p1, p0, Lcom/google/android/gms/ads/q;->c:Z

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/ads/q;->c:Z

    return v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/ads/q;->b:Z

    return v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/ads/q;->a:Z

    return v0
.end method
